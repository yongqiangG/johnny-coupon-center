kage johnny.com.coupon.template.beans;

import johnny.com.coupon.template.beans.rules.TemplateRule;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

/**
 * @Description: 优惠券模板
 * @author: Johnny
 * @date: 2022/7/7
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CouponTemplateInfo {
    private Long id;
    @NotNull
    private String name;
    // 优惠券描述
    @NotNull
    private String desc;
    // 优惠券类型 CouponType
    @NotNull
    private String type;
    // 优惠券适用门店，如果没有表示所有店铺通用
    private Long shopId;
    // 优惠券规则
    @NotNull
    private TemplateRule rule;
    // 当前模板是否可用
    private Boolean available;
}

