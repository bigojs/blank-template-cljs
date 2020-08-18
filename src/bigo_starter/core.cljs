(ns bigo-starter.core)

(def bigo (js/require "bigojs"))
(def http (js/require "http"))

(def template #js {"title" "Hello World"})

(def server 
  (.createServer http
    (fn server-request [req, res]
      (def bigo-request 
        (new bigo.Request req)
      )

      (def first-param 
        (nth bigo-request.route 0 "")
      )

      (.writeHead res 200 {"Content-Type" "text/html"})
      (.end res (.render (new bigo.Component #js {"title" first-param} "<h1>Hello {{title}}</h1>")))
      nil
    )
  )
)

(.listen server 3001 "127.0.0.1" (fn []
  (println "Server running at http://127.0.0.1:3001")
  0
))
