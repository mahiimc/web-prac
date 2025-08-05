```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v3.5.4)

2025-08-06T01:00:26.670+05:30  INFO 3509 --- [webhook] [           main] com.imc.webhook.WebhookApplication       : Starting WebhookApplication using Java 23.0.1 with PID 3509 (/Users/mahi/Documents/Projects/web-prac/spring/webhook/webhook/target/classes started by mahi in /Users/mahi/Documents/Projects/web-prac/spring/webhook/webhook)
2025-08-06T01:00:26.672+05:30  INFO 3509 --- [webhook] [           main] com.imc.webhook.WebhookApplication       : No active profile set, falling back to 1 default profile: "default"
2025-08-06T01:00:27.130+05:30  INFO 3509 --- [webhook] [           main] o.s.b.web.embedded.netty.NettyWebServer  : Netty started on port 8080 (http)
2025-08-06T01:00:27.137+05:30  INFO 3509 --- [webhook] [           main] com.imc.webhook.WebhookApplication       : Started WebhookApplication in 0.642 seconds (process running for 0.793)
2025-08-06T01:00:34.509+05:30 ERROR 3509 --- [webhook] [ctor-http-nio-3] i.n.r.d.DnsServerAddressStreamProviders  : Unable to load io.netty.resolver.dns.macos.MacOSDnsServerAddressStreamProvider, fallback to system defaults. This may result in incorrect DNS resolutions on MacOS. Check whether you have a dependency on 'io.netty:netty-resolver-dns-native-macos'. Use DEBUG level to see the full stack: java.lang.UnsatisfiedLinkError: failed to load the required native library
2025-08-06T01:00:39.571+05:30 ERROR 3509 --- [webhook] [ctor-http-nio-4] c.i.w.c.PaymentRequestController         : Payment failed for transaction ID : 10000001
2025-08-06T01:00:49.989+05:30  INFO 3509 --- [webhook] [ctor-http-nio-4] c.i.w.c.PaymentRequestController         : Payment successful for Transaction ID : 10000001 
2025-08-06T01:00:58.025+05:30  INFO 3509 --- [webhook] [ctor-http-nio-4] c.i.w.c.PaymentRequestController         : Payment successful for Transaction ID : 10000001 
2025-08-06T01:01:08.706+05:30 ERROR 3509 --- [webhook] [ctor-http-nio-4] c.i.w.c.PaymentRequestController         : Payment failed for transaction ID : 10000001
2025-08-06T01:01:16.640+05:30  INFO 3509 --- [webhook] [ionShutdownHook] o.s.b.w.embedded.netty.GracefulShutdown  : Commencing graceful shutdown. Waiting for active requests to complete
2025-08-06T01:01:16.641+05:30  INFO 3509 --- [webhook] [ netty-shutdown] o.s.b.w.embedded.netty.GracefulShutdown  : Graceful shutdown complete
```