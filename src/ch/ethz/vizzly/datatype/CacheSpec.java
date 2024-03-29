/*
 * Copyright 2013 ETH Zurich, Computer Engineering and Networks Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ch.ethz.vizzly.datatype;

import java.util.HashMap;

/**
 * This class implements a data structure that represents a cache specification made
 * in the XML configuration file of Vizzly.
 * @author Matthias Keller
 *
 */
public class CacheSpec implements Comparable<CacheSpec> {

    public static final String CACHE_TYPE_MEM = "memcache";
    
    public static final String CACHE_TYPE_SQL = "sqlcache";
    
    public String type;
    
    public int windowLength;
    
    public HashMap<String, String> optionalParameters = null;
    
    public CacheSpec() {
        optionalParameters = new HashMap<String, String>();
    }
    
    public int compareTo(CacheSpec other) {
        if(other.windowLength > this.windowLength) {
            return -1;
        } else if(this.windowLength > other.windowLength) {
            return 1;
        }
        return 0;
    }

}
