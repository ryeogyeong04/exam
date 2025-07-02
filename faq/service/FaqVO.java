/**
 * 
 */
package egovframework.example.faq.service;

import lombok.Data;

/**
 * @author user
 *
 */
@Data
public class FaqVO {
	 private Long faqId;
	    private String question;
	    private String answer;
	    private String category;
	    private String regDate;
}
