/*
 * Copyright (c) 2010 Tonic Solutions LLC.
 *
 * http://www.nimbits.com
 *
 *
 * Licensed under the GNU GENERAL PUBLIC LICENSE, Version 3.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.gnu.org/licenses/gpl.html
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the license is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, eitherexpress or implied. See the License for the specific language governing permissions and limitations under the License.
 */

package com.nimbits.server.transactions.dao.point;

import com.nimbits.client.exception.*;
import com.nimbits.client.model.entity.*;
import com.nimbits.client.model.point.*;
import com.nimbits.server.entity.*;
import com.nimbits.server.orm.*;
import com.nimbits.server.point.*;
import helper.*;
import static org.junit.Assert.*;
import org.junit.*;

import java.util.*;

/**
 * Created by bsautner
 * User: benjamin
 * Date: 4/1/12
 * Time: 8:02 PM
 */
public class PointDaoImplTest extends NimbitsServletTest{

    @Test
    public void getPointsTest() throws NimbitsException {

        List<Entity> e = new ArrayList<Entity>(2);
        e.add(EntityServiceFactory.getInstance().getEntityByKey(point.getKey(),PointEntity.class.getName()));
        e.add(EntityServiceFactory.getInstance().getEntityByKey(pointChild.getKey(),PointEntity.class.getName()));
        List<Point> result = PointTransactionsFactory.getInstance(user).getPoints(e);
        assertEquals(2, result.size());


    }
}
