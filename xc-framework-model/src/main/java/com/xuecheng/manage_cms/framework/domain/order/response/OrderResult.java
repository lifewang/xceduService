package com.xuecheng.manage_cms.framework.domain.order.response;

import com.xuecheng.manage_cms.framework.domain.order.XcOrders;
import com.xuecheng.manage_cms.framework.model.response.ResponseResult;
import com.xuecheng.manage_cms.framework.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * Created by mrt on 2018/3/26.
 */
@Data
@ToString
public class OrderResult extends ResponseResult {
    private XcOrders xcOrders;
    public OrderResult(ResultCode resultCode, XcOrders xcOrders) {
        super(resultCode);
        this.xcOrders = xcOrders;
    }


}
