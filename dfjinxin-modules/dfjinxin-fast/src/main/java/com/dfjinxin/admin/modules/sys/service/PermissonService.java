/**
 * 2019 dfjinxin
 */

package com.dfjinxin.admin.modules.sys.service;

import java.util.Set;

public interface PermissonService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

}
