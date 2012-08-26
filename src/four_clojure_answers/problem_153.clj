(ns four-clojure-answers.problem-153)

(def answer
  (comp (partial apply distinct?)
        (partial apply concat)))
