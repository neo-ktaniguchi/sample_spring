package jp.ad.iij.nusso.nusso_batch.sample_spring_batch_tasklet.config;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.job.builder.JobBuilder;
import org.springframework.batch.core.repository.JobRepository;
import org.springframework.batch.core.step.builder.StepBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.PlatformTransactionManager;
import jp.ad.iij.nusso.nusso_batch.sample_spring_batch_tasklet.tasklet.SampleTasklet;

@Configuration
public class BatchConfig {
    @Bean
    Job sampleTaskletJob(JobRepository jobRepository, PlatformTransactionManager txManager) {
        Step step = new StepBuilder("sampleTaskletJob", jobRepository)
                .tasklet(new SampleTasklet(), txManager).build();

        return new JobBuilder("sampleTaskletJob", jobRepository).start(step).build();
    }
}
