(ns four-clojure-answers.problem-096)

(def answer
  (fn [[_ l r]]
    (letfn
      [(mirror [t]
         (when-let [[v l r] t]
           [v (mirror r) (mirror l)]))]
      (= l (mirror r)))))
