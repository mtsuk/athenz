//
// This file generated by rdl 1.4.8. Do not modify!
//

package com.yahoo.athenz.zms;
import java.util.List;
import com.yahoo.rdl.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

//
// TenantDomains -
//
@JsonSerialize(include = JsonSerialize.Inclusion.NON_DEFAULT)
public class TenantDomains {
    public List<String> tenantDomainNames;

    public TenantDomains setTenantDomainNames(List<String> tenantDomainNames) {
        this.tenantDomainNames = tenantDomainNames;
        return this;
    }
    public List<String> getTenantDomainNames() {
        return tenantDomainNames;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != TenantDomains.class) {
                return false;
            }
            TenantDomains a = (TenantDomains) another;
            if (tenantDomainNames == null ? a.tenantDomainNames != null : !tenantDomainNames.equals(a.tenantDomainNames)) {
                return false;
            }
        }
        return true;
    }
}