package com.qc.gulimall.coupon.service.impl;

import com.qc.common.utils.PageUtils;
import com.qc.common.utils.Query;
import com.qc.gulimall.coupon.dao.MemberPriceDao;
import com.qc.gulimall.coupon.entity.MemberPriceEntity;
import com.qc.gulimall.coupon.service.MemberPriceService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("memberPriceService")
public class MemberPriceServiceImpl extends ServiceImpl<MemberPriceDao, MemberPriceEntity> implements MemberPriceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<MemberPriceEntity> page = this.page(
                new Query<MemberPriceEntity>().getPage(params),
                new QueryWrapper<MemberPriceEntity>()
        );

        return new PageUtils(page);
    }

}