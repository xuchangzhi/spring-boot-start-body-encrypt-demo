package com.gl.start.encryptdemo.controller;

import com.gl.encrypt.annotation.Decrypt;
import com.gl.encrypt.annotation.Encrypt;
import com.gl.start.encryptdemo.common.CommonResult;
import com.gl.start.encryptdemo.vo.Student;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Encrypt
    @ApiOperation(value = "001、测试响应数据加密")
    @RequestMapping(value = "/encrypt", method = RequestMethod.POST)
    public CommonResult encrypt(@RequestBody Student student) {

        return CommonResult.success(student);

    }


    @Decrypt
    @ApiOperation(value = "002、测试请求数据解密")
    @RequestMapping(value = "/decrypt", method = RequestMethod.POST)
    public CommonResult Decrypt(@RequestBody Student student) {
        return CommonResult.success(student);
    }



    @ApiOperation(value = "003、普通请求测试")
    @RequestMapping(value = "/common", method = RequestMethod.POST)
    public CommonResult common(@RequestBody Student student) {
        return CommonResult.success(student);
    }


    @Decrypt
    @Encrypt
    @ApiOperation(value = "004、测试解密加密")
    @RequestMapping(value = "/decryptEncrypt", method = RequestMethod.POST)
    public CommonResult decryptEncrypt(@RequestBody Student student) {
        return CommonResult.success(student);
    }


}
