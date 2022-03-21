package org.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.stream.IntStream;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class TomcatController {
	@GetMapping("/hello")
	public Collection<String> sayHello() {
		return IntStream.range(0,10)
			.mapToObj(i -> "Hello number " + i)
			.collect(Collectors.toList());
	}
}