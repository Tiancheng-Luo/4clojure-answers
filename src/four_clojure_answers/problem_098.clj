(ns four-clojure-answers.problem-098)

(def answer
  (fn [f s]
    (->> s
      (group-by f)
      vals
      (map set)
      set)))
