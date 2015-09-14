/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package advertisement;

/**
 *
 * @author Jacob
 */
public class Advertisement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String company = "acme";
        company = company.toUpperCase();
        System.out.println(company);
        String ad = "Buy " + company + " products";
        System.out.println(ad);
    }
}
