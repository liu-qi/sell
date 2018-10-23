package com.immoc.sell.utils;

import com.immoc.sell.vo.ResultVO;

/**
 * Description: 返回数据设置工具类
 * Created by Liu qi.
 * Date: 2018-10-23 22:50
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }

    public static ResultVO success() {
        return success(null);
    }

    public static ResultVO error(Integer errCode, String errMsg) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(errCode);
        resultVO.setMsg(errMsg);
        return resultVO;
    }

}
