package br.com.exemplo.config;

import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.ArrayList;
import java.util.List;

//import converter.ZonedDateTimeReadConverter;
//import converter.ZonedDateTimeWriteConverter;
//import org.springframework.data.mongodb.core.convert.MongoCustomConversions;
//import com.baeldung.converter.UserWriterConverter;
//import com.baeldung.event.CascadeSaveMongoEventListener;
//import com.baeldung.event.UserCascadeSaveMongoEventListener;

//@Configuration
//@EnableMongoRepositories(basePackages = "br.com")
//public class MongoConfig extends AbstractMongoConfiguration {
public class MongoConfig {

    private final List<Converter<?, ?>> converters = new ArrayList<Converter<?, ?>>();

    //@Override
    protected String getDatabaseName() {
        return "test";
    }

    //@Override
    public MongoClient mongoClient() {
        return new MongoClient("127.0.0.1", 27017);
    }

    //@Override
    public String getMappingBasePackage() {
        return "br.com";
    }

    //@Bean
    //public UserCascadeSaveMongoEventListener userCascadingMongoEventListener() {
    //return new UserCascadeSaveMongoEventListener();
    //}

    //@Bean
    //public CascadeSaveMongoEventListener cascadingMongoEventListener() {
    //return new CascadeSaveMongoEventListener();
    //}

    /*@Override
    public MongoCustomConversions customConversions() {
        converters.add(new UserWriterConverter());
        converters.add(new ZonedDateTimeReadConverter());
        converters.add(new ZonedDateTimeWriteConverter());
        return new MongoCustomConversions(converters);
    }*/

    /*@Bean
    public GridFsTemplate gridFsTemplate() throws Exception {
        return new GridFsTemplate(mongoDbFactory(), mappingMongoConverter());
    }*/

    /*@Bean
    MongoTransactionManager transactionManager(MongoDbFactory dbFactory) {
        return new MongoTransactionManager(dbFactory);
    }*/
}