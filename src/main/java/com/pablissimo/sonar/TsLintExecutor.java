package com.pablissimo.sonar;

import java.util.List;

import org.sonar.api.batch.BatchSide;

@BatchSide
public interface TsLintExecutor {
    List<String> execute(TsLintExecutorConfig config, List<String> files);
}
