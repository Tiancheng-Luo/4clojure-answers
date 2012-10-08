(ns four-clojure-answers.problem-102)

(def answer
  (fn [s]
    (let [[first-s & rest-s] (clojure.string/split s #"-")]
      (apply str
             first-s
             (map clojure.string/capitalize rest-s)))))
