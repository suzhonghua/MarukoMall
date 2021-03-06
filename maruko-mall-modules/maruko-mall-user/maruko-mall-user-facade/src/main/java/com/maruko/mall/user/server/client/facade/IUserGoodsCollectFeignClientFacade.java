package com.maruko.mall.user.server.client.facade;

import com.maruko.mall.user.server.client.facade.api.IUserGoodsCollectFacade;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * 用户_商品收藏表
 *
 * @author xiaofeng
 * @date 2019-06-17 20:31:49
 */
@FeignClient(value = "${maruko-mall-user-server}")
public interface IUserGoodsCollectFeignClientFacade extends IUserGoodsCollectFacade {
}
