package com.thedeathstar.repository;

import com.thedeathstar.model.DeathStar;
import com.thedeathstar.model.DeathStars;

import java.util.List;

/**
 * Created by Jeremy on 6/26/17.
 */
public interface DeathStarRepository {

    List<DeathStar> GetDeathstars();

    DeathStar GetDeathstar();

    }
