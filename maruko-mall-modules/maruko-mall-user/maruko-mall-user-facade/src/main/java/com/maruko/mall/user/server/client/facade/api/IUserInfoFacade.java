package com.maruko.mall.user.server.client.facade.api;

import com.maruko.mall.common.msg.BaseResponse;
import com.maruko.mall.common.msg.ListRestResponse;
import com.maruko.mall.common.msg.ObjectRestResponse;
import com.maruko.mall.common.msg.TableResultResponse;
import com.maruko.mall.common.page.PageRestRequest;
import com.maruko.mall.user.server.client.dto.UserInfoDTO;
import org.springframework.web.bind.annotation.*;

/**
 * 用户_帐号信息
 *
 * @author xiaofeng
 * @date 2019-06-17 20:31:49
 */
public interface IUserInfoFacade {

	/**
	 * 添加数据
	 * @param userInfoDTO
	 * @return
	 */
	@PostMapping("/facade/userInfo/add")
	BaseResponse add(@RequestBody UserInfoDTO userInfoDTO);

	/**
	 * 更新数据
	 * @param userInfoDTO
	 * @return
	 */
	@PutMapping("/facade/userInfo/update")
	BaseResponse update(@RequestBody UserInfoDTO userInfoDTO);

	/**
	 * 根据ID删除数据
	 * @param id
	 * @return
	 */
	@DeleteMapping("/facade/userInfo/remove/{id}")
	BaseResponse remove(@PathVariable("id") Integer id);

	/**
	 * 根据Id查找
	 * @param id
	 * @return
	 */
	@GetMapping("/facade/userInfo/findById/{id}")
	ObjectRestResponse<UserInfoDTO> findById(@PathVariable("id") Integer id);


	/**
	 * 根据条件查找数据
	 * @param userInfoDTO
	 * @return
	 */
	@PostMapping("/facade/userInfo/query")
	ListRestResponse<UserInfoDTO> query(@RequestBody UserInfoDTO userInfoDTO);

	/**
	 * 查找数据显示分页
	 * @param pageRestRequest
	 * @return
	 */
	@PostMapping("/facade/userInfo/page")
	TableResultResponse<UserInfoDTO> page(@RequestBody PageRestRequest<UserInfoDTO> pageRestRequest);

	/**
	 * 根据条件查找数据
	 * @param userInfoDTO
	 * @return
	 */
	@PostMapping("/facade/userInfo/findByCondition")
	ObjectRestResponse<UserInfoDTO> findByCondition(@RequestBody UserInfoDTO userInfoDTO);

}
