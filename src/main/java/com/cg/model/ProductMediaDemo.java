//package com.cg.model;
//
//import lombok.*;
//import lombok.experimental.Accessors;
//import org.hibernate.annotations.GenericGenerator;
//
//import javax.persistence.*;
//import java.util.Date;
//
//
//@ToString(exclude = "product")
//@EqualsAndHashCode(exclude = "product")
//@Entity
//@Getter
//@Setter
//@NoArgsConstructor
//@AllArgsConstructor
//@Accessors(chain = true)
//@Table(name = "demo-product_media")
//public class ProductMediaDemo {
//
//    @Id
//    @GeneratedValue(generator = "uuid")
//    @GenericGenerator(name = "uuid", strategy = "uuid2")
//    private String id;
//
//    @Column(name = "file_name")
//    private String fileName;
//
//    @Column(name = "file_folder")
//    private String fileFolder;
//
//    @Column(name = "file_url")
//    private String fileUrl;
//
//    @Column(name = "file_type")
//    private String fileType;
//
//    @Column(name = "cloud_id")
//    private String cloudId;
//
//
//    @Column(columnDefinition = "BIGINT(20) DEFAULT 0")
//    private Long ts = new Date().getTime();
//
//    @ManyToOne
//    @JoinColumn(name = "product_id")
//    private ProductDemo productDemo;
//
//}
