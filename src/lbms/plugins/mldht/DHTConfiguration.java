/*
 *    This file is part of mlDHT.
 * 
 *    mlDHT is free software: you can redistribute it and/or modify
 *    it under the terms of the GNU General Public License as published by
 *    the Free Software Foundation, either version 2 of the License, or
 *    (at your option) any later version.
 * 
 *    mlDHT is distributed in the hope that it will be useful,
 *    but WITHOUT ANY WARRANTY; without even the implied warranty of
 *    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *    GNU General Public License for more details.
 * 
 *    You should have received a copy of the GNU General Public License
 *    along with mlDHT.  If not, see <http://www.gnu.org/licenses/>.
 */
package lbms.plugins.mldht;

import java.net.InetSocketAddress;
import java.nio.file.Path;

public interface DHTConfiguration {
	
	public boolean isPersistingID();

	public Path getStoragePath();

	public int getListeningPort();
	
	public boolean noRouterBootstrap();
	
	public boolean allowMultiHoming();

	default InetSocketAddress[] getUnresolvedBootstrapNodes() {
		return new InetSocketAddress[]{
			InetSocketAddress.createUnresolved("dht.transmissionbt.com", 6881),
			InetSocketAddress.createUnresolved("router.bittorrent.com", 6881),
			InetSocketAddress.createUnresolved("router.utorrent.com", 6881),
			InetSocketAddress.createUnresolved("router.silotis.us", 6881),
		};
	}

}
