(ns four-clojure-answers.problem-021)

(def answer-021
  (fn [coll idx]
    (first (drop idx coll))))
