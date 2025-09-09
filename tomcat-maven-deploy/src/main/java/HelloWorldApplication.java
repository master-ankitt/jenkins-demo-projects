package com.springhow.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class HelloWorldApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(HelloWorldApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloWorldApplication.class, args);
    }

    @GetMapping("/")
    public String welcome() {
        return "<!DOCTYPE html>" +
                "<html>" +
                "<head>" +
                "<title>Welcome to my page</title>" +
                "<style>" +
                "body {" +
                "  margin: 0;" +
                "  font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;" +
                "  background: linear-gradient(to right, #4facfe, #00f2fe);" +
                "  height: 100vh;" +
                "  display: flex;" +
                "  align-items: center;" +
                "  justify-content: center;" +
                "  color: #333;" +
                "}" +
                ".card {" +
                "  background: white;" +
                "  padding: 40px;" +
                "  border-radius: 15px;" +
                "  box-shadow: 0 8px 16px rgba(0,0,0,0.3);" +
                "  max-width: 700px;" +
                "  text-align: center;" +
                "}" +
                ".title {" +
                "  font-size: 32px;" +
                "  color: #007BFF;" +
                "  margin-bottom: 20px;" +
                "}" +
                "ul {" +
                "  list-style: none;" +
                "  padding: 0;" +
                "}" +
                "li::before {" +
                "  content: '✅ ';" +
                "}" +
                "</style>" +
                "</head>" +
                "<body>" +
                "<div class='card'>" +
                "<div class='title'>👋 Welcome to My DevOps Page</div>" +
                "<h2>Hi, I'm <strong>Ankit</strong> – a passionate <span style='color:green;'>DevOps Engineer</span>.</h2>" +
                "<p>I build and manage automated CI/CD pipelines, cloud infrastructure, and ensure efficient, secure deployments.</p>" +
                "<h3>🛠️ Technologies I work with:</h3>" +
                "<ul>" +
                "<li>Docker & Kubernetes</li>" +
                "<li>Jenkins & GitHub Actions</li>" +
                "<li>AWS, Azure, Terraform</li>" +
                "</ul>" +
                "<p>💡 I automate to eliminate manual errors and deliver faster, more reliable software.</p>" +
                "<h3 style='color:#28a745;'>Let’s connect and build something amazing! 🚀</h3>" +
                "</div>" +
                "</body>" +
                "</html>";
    }
}