(ns pizza-party.web
  (:require [compojure.core :refer [defroutes GET]]
            [ring.adapter.jetty :as ring]
            [hiccup.page :as page]))

(defn index []
  (page/html5
    [:head
      [:title "PIZZA PARTY"]]
    [:body
      [:div {:style "background: url('http://cultofthepartyparrot.com/parrots/pizzaparrot.gif') repeat; height: 500px;"}]
      [:h1 {:style "text-align: center"} "PIZZA PARTY EVERY DAY"]
      [:div {:style "background: url('http://cultofthepartyparrot.com/parrots/pizzaparrot.gif') repeat; height: 500px;"}]]))

(defroutes routes
  (GET "/" [] (index)))

(defn -main []
  (ring/run-jetty #'routes {:port 8080 :join? false}))