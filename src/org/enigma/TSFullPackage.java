package org.enigma;

import org.enigma.typescript.*;
import org.enigma.function.*;

@SuppressWarnings("all")
public class TSFullPackage implements TS {
    public void eval(java.lang.String x){
        for(int i=0;i<x.length();i++){

        }
    }
    public int parseInt(java.lang.String string,int radix){
        return Integer.parseInt(string,radix);
    }
    public int parseInt(java.lang.String string){
        return Integer.parseInt(string);
    }
    public float parseFloat(java.lang.String string){
        return Float.parseFloat(string);
    }
    public boolean isNaN(int number){
        return (number!=number);
    }
    public boolean isFinite(int number){
        return (number!=Infinity&&number!=-Infinity);
    }
    public abstract class Array<T> {
        public static boolean isArray(java.lang.Object arg){
            return arg instanceof java.lang.Object[];
        }
        public static java.lang.Object[] prototype=new java.lang.Object[1];
        public int length=0;
        private T[] items=null;
        public abstract java.lang.String toLocaleString();
        public T get(int index){
            return items[index];
        }
        public T pop(){
            T a=this.items[this.length-1];
            this.items[this.length-1]=null;
            --this.length;
            return a;
        }
        @SuppressWarnings("unchecked")
        public int push(T... items){
            int a=this.length;
            for(int i=a;i<(a+items.length);i++){
                this.items[i]=items[i];
                ++this.length;
            }
            return this.length;
        }
        @SuppressWarnings("unchecked")
        public T[] concat(ConcatArray<T>... items){
            for(ConcatArray<T> item:items){
                for(T i:item){
                    this.push(i);
                }
            }
            return this.items;
        };
        @SuppressWarnings("unchecked")
        public T[] concat(T... items){
            for(T item:items){
                this.push(item);
            }
            return this.items;
        }
        public java.lang.String join(char separator){
            java.lang.String a="";
            for(T item:items){
                a+=separator+item.toString();
            }
            return a;
        }
        public java.lang.String join(){
            java.lang.String a="";
            for(T item:items){
                a+=item.toString();
            }
            return a;
        }
        public T[] reverse(){
            T[] a=items;
            for(int i=0;i<length;i++){
                items[items.length-1-i]=a[i];
            }
            return items;
        }
        public T shift();
        public T[] slice(int start,int end){
            T[] a=null;
            for(int i=start;i<end;i++){
                a[i]=items[i];
            }
            return a;
        }
        public T[] slice(int start){
            return slice(start,length-1);
        }
        public T[] slice(){
            return slice(0,length-1);
        }
        public Array<T> sort(java.util.function.Function<T,Number> compareFn);
        public Array<T> sort();
        @SuppressWarnings("unchecked")
        public T[] splice(int start,int deleteCount,T... items);
        public T[] splice(int start,int deleteCount);
        public T[] splice(int start);
        @SuppressWarnings("unchecked")
        public int unshift(T... items);
        public int indexOf(T searchElement,int fromIndex){
            int a=-1;
            for(int i=fromIndex;i<this.length;i++){
                if(items[i]==searchElement){
                    a=i;
                    break;
                }
            }
            return a;
        }
        public int indexOf(T searchElement){
            int a=-1;
            for(int i=0;i<this.length;i++){
                if(items[i]==searchElement){
                    a=i;
                    break;
                }
            }
            return a;
        }
        public int lastIndexOf(T searchElement,int fromIndex){
            int a=-1;
            for(int i=fromIndex;i<this.length;i++){
                if(items[i]==searchElement){
                    a=i;
                }
            }
            return a;
        };
        public int lastIndexOf(T searchElement){
            int a=-1;
            for(int i=0;i<this.length;i++){
                if(items[i]==searchElement){
                    a=i;
                    break;
                }
            }
            return a;
        }
        <S extends T> boolean every(TripleFunction<T,Number,T[],Boolean> predicate,java.lang.Object thisArg);
        <S extends T> boolean every(TripleFunction<T,Number,T[],Boolean> predicate);
        public boolean some(TripleFunction<T,java.lang.Number,T[],Boolean> predicate,java.lang.Object thisArg);
        public boolean some(TripleFunction<T,java.lang.Number,T[],Boolean> predicate);
        public boolean forEach(TripleFunction<T,,T[],Void> callbackfn,java.lang.Object thisArg){
            for(int i=0;i<this.length;i++){
                callbackfn.apply(items[i],i,items);
            }
        }
        public boolean forEach(TripleFunction<T,Number,T[],Void> callbackfn);
        public <U> U[] map(TripleFunction<T,Number,T[],U> predicate,java.lang.Object thisArg);
        public <U> U[] map(TripleFunction<T,Number,T[],U> callbackfn);
        public <S extends T> S[] filter(TripleFunction<T,Number,T[],Boolean> predicate,java.lang.Object thisArg);
        public <S extends T> S[] filter(TripleFunction<T,Number,T[],Boolean> predicate);
        public T reduce(QuadFunction<T,T,Number,T[],T> callbackfn);
        public T reduce(QuadFunction<T,T,Number,T[],T> callbackfn,T initialValue);
        public T reduceRight(QuadFunction<T,T,Number,T[],T> callbackfn);
        public T reduceRight(QuadFunction<T,T,Number,T[],T> callbackfn,T initialValue);
        public <U,This> U[] flatMap(QuadFunction<This,T,Number,T[],U> callback,This thisArg);
        public <U,This> U[] flatMap(QuadFunction<This,T,Number,T[],U> callback);
        public <U,This> U[] flatMap(ReadonlyArray<U> callback,This thisArg);
        public <U,This> U[] flatMap(ReadonlyArray<U> callback);
        public <A,D extends Number> FlatArray<A,D>[] flat(A _this,D depth);
        public <A,D extends Number> FlatArray<A,D>[] flat(A _this);
        public boolean includes(T searchElement,int fromIndex){
            return indexOf(searchElement,fromIndex)!=-1;
        }
        public boolean includes(T searchElement){
            return indexOf(searchElement)!=-1;
        }
        public IterableIterator<java.lang.Number, T> entries();
        public IterableIterator<java.lang.Number> keys();
        public IterableIterator<T> values();
        public <S extends T> S find(QuadFunction<Void,T,java.lang.Number,T[],Boolean> predicate,java.lang.Object thisArg);
        public <S extends T> S find(QuadFunction<Void,T,java.lang.Number,T[],Boolean> predicate);
        public T find(TripleFunction<T,Number,T[],java.lang.Object> predicate,java.lang.Object thisArg);
        public T find(TripleFunction<T,Number,T[],Object> predicate);
        public T findIndex(TripleFunction<T,Number,T[],java.lang.Object> predicate,java.lang.Object thisArg);
        public T findIndex(TripleFunction<T,Number,T[],java.lang.Object> predicate);
        public Array<T> fill(T value,int start,int end);
        public Array<T> fill(T value,int start);
        public Array<T> fill(T value);
        public Array<T> copyWithin(int target,int start,int end);
        public Array<T> copyWithin(int target,int start);
    }
}