# 📊 Benchmark Comparison  for blocking HTTP Calls using Feign client

| Metric                  | `/report/blocking`   | `/report/platform`     | `/report/virtual`      |
|-------------------------|----------------------|------------------------|------------------------|
| **Requests**            | 3000                 | 3000                   | 3000                   |
| **Concurrency Level**   | 100                  | 100                    | 100                    |
| **Time Taken (s)**      | 24.379 s             | 0.215 s                | 0.249 s                |
| **Requests/sec**        | 123.06 req/sec       | **13,954.27 req/sec**  | 12,027.37 req/sec      |
| **Mean latency (ms)**   | 812.63 ms            | **7.17 ms**            | 8.31 ms                |
| **Transfer rate (KB/s)**| 19.47 KB/s           | **2207.61 KB/s**       | 1902.77 KB/s           |
| **Failed Requests**     | 0                    | 0                      | 0                      |
| **50% requests within** | 518 ms               | **6 ms**               | 8 ms                   |
| **66% requests within** | 667 ms               | **7 ms**               | 8 ms                   |
| **75% requests within** | 814 ms               | **7 ms**               | 9 ms                   |
| **80% requests within** | 1198 ms              | **7 ms**               | 9 ms                   |
| **90% requests within** | 1462 ms              | **8 ms**               | 11 ms                  |
| **95% requests within** | 1748 ms              | **11 ms**              | 13 ms                  |
| **98% requests within** | 2420 ms              | **17 ms**              | 15 ms                  |
| **99% requests within** | 2603 ms              | **20 ms**              | 15 ms                  |
| **100% longest request**| 5363 ms              | 31 ms                  | **18 ms**              |



For DB calls: 

| Metric                 | Blocking Threads | Platform Threads | Virtual Threads |
|------------------------|------------------|------------------|-----------------|
| **Total Requests**     | 300              | 300              | 300             |
| **Concurrency Level**  | 100              | 100              | 100             |
| **Total Time (s)**     | 62.934           | 0.058            | 0.039           |
| **Requests per Second**| 4.77 [#/sec]     | 5,153.58 [#/sec] | 7,739.54 [#/sec]|
| **Time per Request (ms)** | 20,977.844   | 19.404           | 12.921          |
| **Mean Processing (ms)** | 17,501         | 12               | 8               |
| **Median Processing (ms)** | 20,139       | 11               | 9               |
| **Max Request Time (ms)** | 22,513        | 29               | 16              |
| **Failed Requests**    | 0                | 0                | 0               |
