package com.zensar.olxadvertise.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
//@ApiModel("This is the OlxAdvertise model")
@Entity
public class AdvertiseDetails {
//	@ApiModelProperty("User Id of integer type")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
       private long id;
       private String title;
       private double price;
       private String category;
       private String description;
       private String userName;
       private String createdDate;
       private String modifiedDate;
       private String status;
       private String postedBy;
}
