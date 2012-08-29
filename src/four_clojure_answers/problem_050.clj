(ns four-clojure-answers.problem-050)

(def answer
  (comp vals (partial group-by type)))
