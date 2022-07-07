package johnny.com.coupon.template.beans.rules;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 优惠券领券模板
 * @author: Johnny
 * @date: 2022/7/7
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TemplateRule {
    // 折扣金额
    private Discount discount;
    // 限制每个人的领券数量
    private Integer limitation;
    // 过期时间
    private Long deadline;
}

