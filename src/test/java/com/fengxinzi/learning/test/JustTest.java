package com.fengxinzi.learning.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
public class JustTest {

    public static void main(String[] args) {
        String json = getJson();
        JSONObject jsonMessage = JSON.parseObject(json);
        String yai = jsonMessage.getString("yai");
        String sdkType = jsonMessage.getString("sdk_type");
        String eventSign = jsonMessage.getString("event_sign");
        String eventName = jsonMessage.getString("event_name");
        JSONObject eventParams = jsonMessage.getJSONObject("event_params");


        SimplePropertyPreFilter filter = new SimplePropertyPreFilter(JSONObject.class,"yai","sdk_type","event_sign","event_name","event_params");
        String jsonString = JSON.toJSONString(jsonMessage, filter);
        JSONObject jsonObject = JSONObject.parseObject(jsonString);
        log.info("提取的json:{}", jsonObject);
        System.out.println(jsonObject);

        JSONObject extractJSON = new JSONObject();
        extractJSON.put("yai", yai);
        extractJSON.put("sdkType", sdkType);
        extractJSON.put("eventSign", eventSign);
        extractJSON.put("eventName", eventName);
        extractJSON.put("eventParams", eventParams);
        System.out.println(extractJSON);

        String add = "{\"acceptPrice\":0,\"cashierSalt\":\"1552983613764\",\"cashierSign\":\"5DEC0CE1762E7A60754D339759FFB912\",\"contextRequest\":{\"buyerId\":\"319716848\",\"environment\":\"WX_JS\",\"userIp\":\"113.111.229.170\",\"wxSelfOpenId\":\"oUxJOszDcYPNr7DZXW7qDoaAcO5U\",\"wxSubOpenId\":\"oHIuujnJi8T1Oi5b5PXfL1WVPrNk\",\"wxYzOpenId\":\"oHIuujnJi8T1Oi5b5PXfL1WVPrNk\"},\"newPrice\":-1,\"partnerId\":\"820000000058\",\"payToken\":\"\",\"payTool\":\"WX_JS\",\"prepayId\":\"PT1628421344985094\",\"valueCardNo\":\"\"}";

        long time = Long.valueOf("1550645092646");
        Date date = new Date(time);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        System.out.println(format.format(date));
    }


    public static String getJson() {
        return "{\"log_id\":\"f2fd58533fe6d73154d1069c215ff2f8\",\"log_time\":\"2019-02-19 16:46:14\",\"yai\":\"wsc_c\",\"biz\":\"wsc_c\",\"sdk_type\":\"js\",\"sdk_version\":\"0.7.0\",\"uuid\":\"aac8591a-79cc-eb13-c87a-f526620e9209\",\"is_login\":1,\"login_sign\":\"691980270\",\"is_new\":0,\"first_time\":\"2019-01-06 17:51:44\",\"first_day\":20190106,\"yz_uid\":\"691980270\",\"yz_fans_id\":\"\",\"is_fans\":\"2\",\"fans_id\":\"\",\"shop_id\":\"55\",\"kdt_id\":\"55\",\"event_type\":\"click\",\"event_sign\":\"pay_item\",\"event_name\":\"选择支付方式\",\"event_params\":{\"pay_channel_name\":\"有赞E卡\",\"spm\":\"trade~55\",\"kdt_id\":\"55\",\"page_type_track\":\"iDJ3GNJDHbhHtOl6W3j3ZA==\",\"rurl\":\"https://h5.youzan.com/wsctrade/order/payresult?request_no=E20190219164517100600001\",\"pay_channel\":\"ECARD\",\"hq_kdt_id\":\"55\",\"buyer_id\":691980270,\"type\":\"normal\",\"view_track\":\"XEzHxnIHja6Yr8ecJGJuGw==\",\"prepay_id\":\"PT1625886206984192\"},\"event_time\":\"2019-02-19 16:46:14\",\"event_timestamp\":\"1550565974600\",\"display_url\":\"https://cashier.youzan.com/pay/wsctrade_pay?order_no=E20190219164517100600001&kdt_id=55#/\",\"page_path\":\"cashier.youzan.com/pay/wsctrade_pay\",\"page_pattern\":\"pay/wsctrade_pay\",\"page_ref\":\"cashier.youzan.com/pay/wsctrade_pay#/\",\"query_params\":{\"order_no\":\"E20190219164517100600001\",\"kdt_id\":\"55\"},\"referer_url\":\"https://h5.youzan.com/wsctrade/order/payresult?request_no=E20190219164517100600001\",\"referer_page_path\":\"h5.youzan.com/wsctrade/order/payresult\",\"referer_page_pattern\":\"wsctrade/order/payresult\",\"referer_page_ref\":\"h5.youzan.com/wsctrade/order/payresult\",\"referer_query_params\":{\"request_no\":\"E20190219164517100600001\"},\"page_type\":\"trade\",\"spm\":\"trade~55\",\"display_type\":\"trade\",\"display_id\":\"55\",\"referer_type\":\"\",\"referer_id\":\"\",\"component\":\"\",\"dc_ps\":\"\",\"dc_ps_utime\":\"\",\"dc_ps_day\":0,\"is_dc_ps_land\":0,\"atr_ps\":\"\",\"atr_ps_utime\":\"\",\"atr_ps_day\":0,\"is_atr_ps_land\":0,\"banner_id\":\"\",\"banner_map\":{},\"origin_banner_id\":\"\",\"origin_banner_map\":{},\"referer_origin_banner_id\":\"\",\"referer_origin_banner_map\":{},\"is_share\":\"\",\"is_share_land\":0,\"from_source\":\"\",\"from_params\":{},\"is_from_source_land\":0,\"seq_batch\":\"1548122148812\",\"seq_no\":\"964\",\"ip\":\"172.17.17.126\",\"province\":\"未知地区\",\"city\":\"未知地区\",\"ua\":\"Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/72.0.3626.109 Mobile Safari/537.36\",\"os\":\"Android\",\"os_version\":\"6.0\",\"device\":\"Nexus 5\",\"brower\":\"Chrome Mobile\",\"app_version\":\"\",\"app_channel\":\"\",\"scene\":\"\",\"lng\":\"\",\"lat\":\"\",\"net\":\"other\",\"user_client\":\"\",\"client_app_id\":\"\",\"server\":\"\",\"is_spider\":0,\"is_wsc_c\":1,\"is_choice\":0,\"plat\":{\"sdk_type\":\"js\",\"sdk_version\":\"0.7.0\",\"youzan_app_id\":\"wsc_c\"},\"env\":{\"brower\":\"Chrome Mobile\",\"brower_version\":\"72.0.3626.109\",\"brower_description\":\"Chrome Mobile 72.0.3626.109 on Google Nexus 5 (Android 6.0)\",\"os\":\"Android 6.0\",\"brower_layout\":\"Blink\"},\"user\":{\"first_time\":\"1546768304851\",\"login_sign\":691980270,\"mobile\":\"13757173910\",\"uuid\":\"aac8591a-79cc-eb13-c87a-f526620e9209\"},\"context\":{},\"log_timestamp\":\"1550565974000\",\"par\":20190219,\"track_version\":\"v3\",\"autoclick_title\":\"\",\"autoclick_url\":\"\",\"autoclick_xpath\":\"\",\"user_os\":\"android\",\"fm\":\"click\",\"network_type\":\"other\",\"ut\":\"aac8591a-79cc-eb13-c87a-f526620e9209\",\"buyer_id\":\"691980270\",\"params\":{\"pay_channel_name\":\"有赞E卡\",\"spm\":\"trade~55\",\"kdt_id\":\"55\",\"page_type_track\":\"iDJ3GNJDHbhHtOl6W3j3ZA==\",\"rurl\":\"https://h5.youzan.com/wsctrade/order/payresult?request_no=E20190219164517100600001\",\"pay_channel\":\"ECARD\",\"hq_kdt_id\":\"55\",\"buyer_id\":691980270,\"type\":\"normal\",\"view_track\":\"XEzHxnIHja6Yr8ecJGJuGw==\",\"prepay_id\":\"PT1625886206984192\"}}";
    }
}
