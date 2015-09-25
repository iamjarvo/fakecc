(ns fakecc.core
  (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main [& args]
  (let [card-name (last (js->clj js/process.argv))
        num (case card-name
              "visa" "4242424242424242"
              "discover" "6011000990139424")]
    (println num)))

(set! *main-cli-fn* -main)
