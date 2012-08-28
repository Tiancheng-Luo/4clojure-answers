(ns four-clojure-answers.problem-043)

(def answer
  (fn [coll n]
    (apply map list (partition n coll))))
