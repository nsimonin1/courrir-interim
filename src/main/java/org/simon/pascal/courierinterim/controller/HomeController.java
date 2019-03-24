/**
 *
 */
package org.simon.pascal.courierinterim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simon.pascal.ngos
 *
 */
@RestController
@RequestMapping("/")
public class HomeController {

	@GetMapping
	public String home() {
		return "Courrier interime";
	}

	@GetMapping("/hello")
	public String hello(@RequestParam("nom")String nom) {
		return "Bonjour "+nom+" !";
	}
}
