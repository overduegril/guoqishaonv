package com.xxx.mangoleben.common;

import com.github.pagehelper.PageInfo;
import com.xxx.mangoleben.common.pojo.Result;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * <p>Description:</p>
 * <p>Copyright: Copyright (c)2019$</p>
 * <p>Company: Tope</p>
 * <P>Created Date :2019$-08$-24$</P>
 * <P>@version 1.0</P>
 */
@Log4j2
public class BaseController {

    public BaseController() {
    }

    public Map<String, Object> getParameter(HttpServletRequest request) {
        Map<String, Object> parameterMap = WebUtils.getParametersStartingWith(request, (String)null);
        return parameterMap;
    }

    public Object processInterfacePageInfo(PageInfo<Map<String, Object>> pageInfo) {
        Map<String, Object> jsonMap = new HashMap();
        jsonMap.put("totalRows", pageInfo.getTotal());
        jsonMap.put("pageNo", pageInfo.getPageNum());
        jsonMap.put("data", pageInfo.getList());
        jsonMap.put("code", "200");
        jsonMap.put("message", "成功");
        return jsonMap;
    }

    public Object processInterfacePageInfo(PageInfo<Map<String, Object>> pageInfo, String tablestore) {
        Map<String, Object> jsonMap = new HashMap();
        jsonMap.put("totalRows", pageInfo.getTotal());
        jsonMap.put("pageNo", pageInfo.getPageNum());
        jsonMap.put("data", pageInfo.getList());
        jsonMap.put("tablestore", tablestore);
        jsonMap.put("code", 200);
        jsonMap.put("message", "成功");
        return jsonMap;
    }

    public Object renderSuccess() {
        Result result = new Result();
        result.setCode(200);
        result.setMessage("成功");
        return result;
    }

    public Object renderSuccess(String message) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage(message);
        return result;
    }

    public Object renderSuccess(Object data) {
        Result result = new Result();
        result.setCode(200);
        result.setData(data);
        return result;
    }

    public Object renderSuccess(Object data, String message) {
        Result result = new Result();
        result.setCode(200);
        result.setMessage(message);
        result.setData(data);
        return result;
    }

    public Object renderError(String message) {
        Result result = new Result();
        result.setCode(500);
        result.setMessage(message);
        return result;
    }

    public String saveFile(MultipartFile fileUpload, String destPath) {
        String fileName = fileUpload.getOriginalFilename();
        String suffixName = fileName.substring(fileName.lastIndexOf("."));
        fileName = UUID.randomUUID() + suffixName;

        try {
            File targetFile = new File(destPath, fileName);
            fileUpload.transferTo(targetFile);
            return targetFile.getAbsolutePath();
        } catch (Exception var6) {
            var6.printStackTrace();
            return "";
        }
    }

    @ExceptionHandler
    @ResponseBody
    public Object exception(HttpServletRequest request, Exception ex) {
        log.error(ex.getMessage(), ex);
        ex.printStackTrace();
        return this.renderError("error!");
    }
}
