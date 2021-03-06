package nebula.test


import com.energizedwork.spock.extensions.TempDirectory

class ChangingTestDirSpec extends IntegrationSpec {

  @TempDirectory(clean = false, baseDir = 'build/test/build1') File projectDir

  def 'can change name of project dir'() {
    expect:
    projectDir.absolutePath.contains('build/test/build1')
  }

}
