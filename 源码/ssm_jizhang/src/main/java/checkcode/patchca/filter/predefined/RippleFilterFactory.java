/*
 * Copyright (c) 2020 matou
 * 
 * This file is part of Patchca CAPTCHA library.
 * 
 *  Patchca is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU Lesser General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *  
 *  Patchca is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU Lesser General Public License for more details.
 *  
 *  You should have received a copy of the GNU Lesser General Public License
 *  along with Patchca. If not, see <http://www.gnu.org/licenses/>.
 */
package checkcode.patchca.filter.predefined;

import java.awt.image.BufferedImageOp;
import java.util.ArrayList;
import java.util.List;

import checkcode.patchca.filter.AbstractFilterFactory;
import checkcode.patchca.filter.library.RippleImageOp;


public class RippleFilterFactory extends AbstractFilterFactory {

	protected List<BufferedImageOp> filters;
	protected RippleImageOp ripple;

	public RippleFilterFactory() {
		ripple = new RippleImageOp();
	}

	protected List<BufferedImageOp> getPreRippleFilters() {
		return new ArrayList<BufferedImageOp>();
	}

	protected List<BufferedImageOp> getPostRippleFilters() {
		return new ArrayList<BufferedImageOp>();
		
	}
	
	@Override
	public List<BufferedImageOp> getFilters() {
		if (filters == null) {
			filters = new ArrayList<BufferedImageOp>();
			filters.addAll(getPreRippleFilters());
			filters.add(ripple);
			filters.addAll(getPostRippleFilters());
		}
		return filters;
	}

	
}
