package com.springboot.logging.demo.layouts;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.stereotype.Component;

@Component
public class PatternedConsoleLayout extends PatternLayout {

  private String prefix;

  private String suffix;

  public PatternedConsoleLayout() {
    this.prefix = "prefix";
    this.suffix = "suffix";
  }

/*  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public void setSuffix(String suffix) {
    this.suffix = suffix;
  }*/


  @Override
  public String doLayout(final ILoggingEvent event) {
    return prefix + super.doLayout(event) + suffix;
  }
}
