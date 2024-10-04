package runners;

import com.intuit.karate.junit5.Karate;

public class TestRunner {

	@Karate.Test
	Karate jsonAPITest() {
		return Karate.run("classpath:features/json.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate getAPITest() {
		return Karate.run("classpath:features/getapi.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate getAPIWithQueryTest() {
		return Karate.run("classpath:features/getapiwithquery.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate headersTest() {
		return Karate.run("classpath:features/headers.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate authTokenTest() {
		return Karate.run("classpath:features/authToken.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate postAPITest() {
		return Karate.run("classpath:features/postapi.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate randomEmailTest() {
		return Karate.run("classpath:features/randomEmail.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate postjsonFileTest() {
		return Karate.run("classpath:features/postjsonfile.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate putAPITest() {
		return Karate.run("classpath:features/putapi.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate updateUserTest() {
		return Karate.run("classpath:features/updateuser.feature").relativeTo(getClass());
	}

	@Karate.Test
	Karate deleteAPITest() {
		return Karate.run("classpath:features/deleteapi.feature").relativeTo(getClass());
	}
}
