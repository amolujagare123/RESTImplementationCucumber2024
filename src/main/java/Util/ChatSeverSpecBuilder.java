package Util;

import io.restassured.authentication.PreemptiveBasicAuthScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

import static Util.ConfigReader.*;

public class ChatSeverSpecBuilder {

    static RequestSpecification reqSpec;

    public static RequestSpecification getRequestSpecBuilder() throws IOException {


        String timeStamp = new SimpleDateFormat("_yyyddMM_hhmmss").format(new Date());

        PrintStream log = new PrintStream(new FileOutputStream("log/log"+timeStamp+".txt"));


        PreemptiveBasicAuthScheme auth = new PreemptiveBasicAuthScheme();
        auth.setUserName(getUsername());
        auth.setPassword(getPassword());

      //  if (reqSpec==null) {
            reqSpec = new RequestSpecBuilder()
                    .setBaseUri(getUrl())
                    .setAuth(auth)
                    .setContentType("application/json")
                    .addFilter(RequestLoggingFilter.logRequestTo(log))
                    .addFilter(ResponseLoggingFilter.logResponseTo(log))
                    .build();
      //  }
        return reqSpec;

    }

}
