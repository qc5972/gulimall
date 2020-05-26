package com.qc.gulimall.coupon.service.impl;

import com.qc.common.utils.PageUtils;
import com.qc.common.utils.Query;
import com.qc.gulimall.coupon.dao.SeckillSessionDao;
import com.qc.gulimall.coupon.entity.SeckillSessionEntity;
import com.qc.gulimall.coupon.service.SeckillSessionService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.Map;


@Service("seckillSessionService")
public class SeckillSessionServiceImpl extends ServiceImpl<SeckillSessionDao, SeckillSessionEntity> implements SeckillSessionService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<SeckillSessionEntity> page = this.page(
                new Query<SeckillSessionEntity>().getPage(params),
                new QueryWrapper<SeckillSessionEntity>()
        );

        return new PageUtils(page);
    }

}