(ns four-clojure-answers.problem-061)

(def answer
  (fn [ks vs]
    (into {} (map vector ks vs))))
