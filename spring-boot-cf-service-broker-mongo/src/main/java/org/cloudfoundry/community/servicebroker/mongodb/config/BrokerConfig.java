package org.cloudfoundry.community.servicebroker.mongodb.config;

import org.cloudfoundry.community.servicebroker.config.*;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;



/** 
 * Force the base spring boot packages to be searched for dependencies.
 * 
 * @author sgreenberg
 *
 */

@Configuration
@ComponentScan(
	    basePackages = "org.cloudfoundry.community.servicebroker", 
	    excludeFilters= { 
	        @ComponentScan.Filter(
	            type=FilterType.ASSIGNABLE_TYPE, 
	            value=BrokerApiVersionConfig.class
	        )
	    }
	)
public class BrokerConfig {

}
