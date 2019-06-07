
(ns app.main
  (:require [app.lib :as lib]
            ["lucene-tokenizers-for-bitfondue" :refer [tokenize_js]]
            ["dexie" :refer [Dexie]]))

(def a 1)

(defonce b 2)

(def ^:private db (do (new Dexie "example-db")))

(defn- tokenize
  "Turn the provided text into tokens"
  [text]
  (js->clj (tokenize_js text) :keywordize-keys true))

(defn main! []
  (println "[main]: loading"))

(defn reload! []
  (println "[main] reloaded lib:" lib/c lib/d)
  (println "[main] reloaded:" a b))
