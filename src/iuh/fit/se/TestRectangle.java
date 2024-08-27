/*
 * @(#) TestRectangle.java    1.0     27/08/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;


/*
 * @description:
 * @author: Ngo Anh Kiet
 * @date:   27/08/2024
 * @version:    1.0
 */

public class TestRectangle {
    public static void main(String[] args) throws Exception {
//       Rectangle hcn1 = new Rectangle(-1, 2);
//        System.out.println(hcn1);

        Rectangle hcn2 = new Rectangle(5, 2);
        System.out.println(hcn2);

        double dienTichHCN = hcn2.getArea();
        double chuviHCN = hcn2.getPerimeter();
        System.out.println("dienTichHCN = " + dienTichHCN);
        System.out.println("chuviHCN = " + chuviHCN);
    }
}
