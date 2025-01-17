package net.totime.mail.controller.pay;

import com.egzosn.pay.ali.api.AliPayService;
import com.egzosn.pay.web.support.HttpRequestNoticeParams;
import com.egzosn.pay.wx.v3.api.WxPayService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author JanYork
 * @version 1.0.0
 * @date 2023/04/18
 * @description 支付回调接口
 * @since 1.0.0
 */
@RestController
@Slf4j
@RequestMapping("/pay")
public class PayCallback {
    @Resource
    private WxPayService wxPayservice;
    @Resource
    private AliPayService aliPayService;

    /**
     * 微信支付回调
     *
     * @param request {@link HttpServletRequest} 请求
     * @return {@link String} 支付回调结果
     */
    @RequestMapping("/wx/callback")
    public String wxPayBack(HttpServletRequest request) {
        return wxPayservice.payBack(new HttpRequestNoticeParams(request)).toMessage();
    }

    /**
     * 支付宝回调
     *
     * @param request 请求
     * @return {@link String}
     */
    @RequestMapping(value = "/ali/callback")
    public String aliPayBack(HttpServletRequest request) {
        return aliPayService.payBack(new HttpRequestNoticeParams(request)).toMessage();
    }
}
