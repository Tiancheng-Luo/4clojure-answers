(ns four-clojure-answers.problem-153-test
  (:use four-clojure-answers.problem-153
        clojure.test))

(deftest problem-153-test
  (is (= (answer #{#{\U} #{\s} #{\e \R \E} #{\P \L} #{\.}})
         true))
  (is (= (answer #{#{:a :b :c :d :e}
                   #{:a :b :c :d}
                   #{:a :b :c}
                   #{:a :b}
                   #{:a}})
         false))
  (is (= (answer #{#{[1 2 3] [4 5]}
                   #{[1 2] [3 4 5]}
                   #{[1] [2] 3 4 5}
                   #{1 2 [3 4] [5]}})
         true))
  (is (= (answer #{#{'a 'b}
                   #{'c 'd 'e}
                   #{'f 'g 'h 'i}
                   #{''a ''c ''f}})
         true))
  (is (= (answer #{#{'(:x :y :z) '(:x :y) '(:z) '()}
                   #{#{:x :y :z} #{:x :y} #{:z} #{}}
                   #{'[:x :y :z] [:x :y] [:z] [] {}}})
         false))
  (is (= (answer #{#{(= "true") false}
                   #{:yes :no}
                   #{(class 1) 0}
                   #{(symbol "true") 'false}
                   #{(keyword "yes") ::no}
                   #{(class '1) (int \0)}})
         false))
  (is (= (answer #{#{distinct?}
                   #{#(-> %) #(-> %)}
                   #{#(-> %) #(-> %) #(-> %)}
                   #{#(-> %) #(-> %) #(-> %)}})
         true))
  (is (= (answer #{#{(#(-> *)) + (quote mapcat) #_ nil}
                   #{'+ '* mapcat (comment mapcat)}
                   #{(do) set contains? nil?}
                   #{, , , #_, , empty?}})
         false)))
