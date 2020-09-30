package de.caritas.cob.uploadservice.api.helper;

import static de.caritas.cob.uploadservice.helper.TestConstants.FILE_NAME_DEFAULT;
import static de.caritas.cob.uploadservice.helper.TestConstants.FILE_NAME_ONLY_SPECIAL_CHARS;
import static de.caritas.cob.uploadservice.helper.TestConstants.FILE_NAME_SANITIZED;
import static de.caritas.cob.uploadservice.helper.TestConstants.FILE_NAME_UNSANITIZED;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class FileSanitizerTest {

  @Test
  public void sanitizeFileName_Should_ReturnSanitizedFileName() {
    assertEquals(FILE_NAME_SANITIZED, FileSanitizer.sanitizeFileName(FILE_NAME_UNSANITIZED));
  }

  @Test
  public void sanitizeFileName_Should_ReturnDefaultFileName_When_SanitationRemovesAllChars() {
    assertEquals(FILE_NAME_DEFAULT, FileSanitizer.sanitizeFileName(FILE_NAME_ONLY_SPECIAL_CHARS));
  }

}
