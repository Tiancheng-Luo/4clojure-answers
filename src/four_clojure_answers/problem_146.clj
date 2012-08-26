(ns four-clojure-answers.problem-146)

(def answer
  (fn [m]
    (into {}
          (for [[k1 v1] m
                [k2 v2] v1]
            [[k1 k2] v2]))))
