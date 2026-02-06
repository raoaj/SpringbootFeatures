Spring Bean and IOC  -> https://www.youtube.com/watch?v=aS9SQITRocc

 Or 																											 
 How Spring boot run method works. Post mortem of run method                                                      
 public static void main(String[] args) {
		SpringApplication.run(Springboot4FeaturesApplication.class, args);
	}
 https://www.youtube.com/watch?v=9VP5533WavE&list=PL3NrzZBjk6m-P7k8tmq1wJOdJ0_ZpPxbp&index=3
https://www.youtube.com/watch?v=TWK7-gzTiHk
 

Tutorials: Playlist
https://www.youtube.com/playlist?list=PL-bgVzzRdaPhNeXyQBtp8hMlUc14J2kRK





Demo Packages
@ConfigurationProperties Demo https://www.youtube.com/watch?v=8a8Qbjw99ag                                                                                    
Content Negotiator Demo https://www.youtube.com/watch?v=GL4OWv_7k5o





List of Annotation to learn in Spring Web






For Vinay:
import org.springframework.stereotype.Component
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RestController
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service

HTTP Methods
---------------------------------------------------------
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.PatchMapping
import org.springframework.web.bind.annotation.DeleteMapping
---------------------------------------------------------

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestPart
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RequestAttribute
import org.springframework.web.bind.annotation.RequestHeader
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.BindParam
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.InitBinder
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.RestControllerAdvice




import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperties
import org.springframework.boot.autoconfigure.condition.ConditionalOnBooleanProperty
import org.springframework.boot.autoconfigure.condition.ConditionalOnCheckpointRestore
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperties
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty
import org.springframework.boot.autoconfigure.condition.ConditionalOnResource
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding
import org.springframework.boot.context.properties.ConfigurationPropertiesScan
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.convert.Delimiter
import org.springframework.boot.convert.DurationFormat
import org.springframework.boot.convert.DurationUnit
import org.springframework.boot.convert.PeriodFormat



/Springboot Annotations
/*

import org.springframework.boot.SpringBootConfiguration
import org.springframework.boot.autoconfigure.AutoConfiguration
import org.springframework.boot.autoconfigure.AutoConfigurationPackage
import org.springframework.boot.autoconfigure.AutoConfigureAfter
import org.springframework.boot.autoconfigure.AutoConfigureBefore
import org.springframework.boot.autoconfigure.AutoConfigureOrder
import org.springframework.boot.autoconfigure.ImportAutoConfiguration
import org.springframework.boot.autoconfigure.condition.ConditionalOnCloudPlatform
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression
import org.springframework.boot.autoconfigure.condition.ConditionalOnJava
import org.springframework.boot.autoconfigure.condition.ConditionalOnJndi
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingFilterBean
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWarDeployment
import org.springframework.boot.autoconfigure.condition.ConditionalOnNotWebApplication
import org.springframework.boot.autoconfigure.condition.ConditionalOnSingleCandidate
import org.springframework.boot.autoconfigure.condition.ConditionalOnThreading
import org.springframework.boot.autoconfigure.condition.ConditionalOnWarDeployment
import org.springframework.boot.autoconfigure.condition.ConditionalOnWebApplication
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType
import org.springframework.boot.autoconfigure.web.ConditionalOnEnabledResourceChain
import org.springframework.boot.context.properties.ConfigurationPropertiesSource
import org.springframework.boot.context.properties.DeprecatedConfigurationProperty
import org.springframework.boot.context.properties.NestedConfigurationProperty
import org.springframework.boot.context.properties.bind.ConstructorBinding
import org.springframework.boot.context.properties.bind.DefaultValue
import org.springframework.boot.context.properties.bind.Name
import org.springframework.boot.context.properties.bind.Nested
import org.springframework.boot.convert.DataSizeUnit
import org.springframework.boot.convert.PeriodUnit
import org.springframework.boot.jackson.JacksonComponent
import org.springframework.boot.jackson.JacksonMixin;
*/
